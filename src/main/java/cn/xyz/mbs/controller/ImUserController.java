package cn.xyz.mbs.controller;

import cn.xyz.mbs.controller.volidate.Volidate2;
import cn.xyz.mbs.po.ImUser;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;
import cn.xyz.mbs.service.ImUserService;
import cn.xyz.mbs.service.impl.ImUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.*;

/**
 * Created by fanchengwei on 2017/7/26.
 * 接收页面提交的数据是通过方法形参来接收，而不是通过Controller类定义成员变量接收！！！！
 *
 * 参数绑定的默认类型HttpServletRequest、HttpServletResponse、HttpSession、Model/ModelMap
 * ModelMap是Model接口的实现类，通过Model、ModelMap向页面传递数据（model.addAttribute("imUser",imUserCustom);）
 * 实际上是将Model数据填充到了request域
 * 直接在Controller方法的形参上定义这些类型的对象，就可以使用这些对象了。在参数绑定过程当中，如果遇到下边类型直接进行绑定
 *
 * 通过@RequestParam对简单类型的参数进行绑定
 * 如果不使用@RequestParam，要求request传入参数名称和Controller方法的形参名称一致，方可绑定成功
 * @RequestParam(value="id",required=true,defaultValue="3")Integer userId,
 * 通过required属性指定参数是否必须要传入
 * 通过defaultValue可以设置默认值，如果参数没有传入则使用默认值与形参进行绑定
 *
 * pojo绑定：
 * 页面中input的name和Controller的pojo形参中的属性名称一致，将页面中数据绑定到pojo
 *
 * 自定义参数绑定：
 * 将请求日期数据串转换成日期类型，要转换的日期类型和pojo中日期类型一致。
 * 向处理器适配器中注入自定义的参数绑定组件
 *
 */
@Controller
//为了对url进行分类管理，可以在这里定义根路径，最终访问的url是根路径+子路径
//例如：/im/queryImUser.action
//@RequestMapping("/im")
public class ImUserController {
    //@Autowired
    //private ImUserService imUserService;
    @Autowired
    private ImUserService imUserService;
    @ModelAttribute("itemType")
    public Map<String,String> getItemType(){
        Map<String,String> itemType = new HashMap<String,String>();
        itemType.put("101","数码");
        itemType.put("102","母婴");
        return itemType;
    }
    //注解的映射器与注解的处理器必须配对使用
    //RequestMapping实现对queryImUser方法和url进行映射，一个方法对应一个url
    //一般建议将url和方法名写成一样

    /**
     * @RequestMapping 的作用：
     * 1、定义Controller方法对应的url，进行url映射
     * 2、窄化请求映射
     * 3、限制http请求方法
     * 为了对url进行分类管理，可以了在类名添加@RequestMapping注解，定义根路径，最终访问的url为：根路径+子路径
     * 窄化请求路径
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryImUser")
    public ModelAndView queryImUser()throws Exception{

        ImUserVo imUserVo = new ImUserVo();

        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setName("管");
        imUserVo.setImUserCustom(imUserCustom);
        List<ImUserCustom> imUserCustomList = imUserService.selectImUserByIdAndName(imUserVo);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于在request的setAttribute，在jsp页面中通过imUserList获取数据
        modelAndView.addObject("imUserList",imUserCustomList);

        //指定视图
        modelAndView.setViewName("/WEB-INF/jsp/imUserList.jsp");

        return modelAndView;
    }

    @RequestMapping("queryImUserEdit")
    public ModelAndView queryImUserEdit()throws Exception{

        ImUserVo imUserVo = new ImUserVo();

        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setName("管");
        imUserVo.setImUserCustom(imUserCustom);
        List<ImUserCustom> imUserCustomList = imUserService.selectImUserByIdAndName(imUserVo);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于在request的setAttribute，在jsp页面中通过imUserList获取数据
        modelAndView.addObject("imUserList",imUserCustomList);

        //指定视图
        modelAndView.setViewName("/WEB-INF/jsp/imUserEditList.jsp");

        return modelAndView;
    }

    @RequestMapping("queryImUserEditMap")
    public ModelAndView queryImUserEditMap()throws Exception{

        ImUserVo imUserVo = new ImUserVo();

        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setName("管");
        imUserVo.setImUserCustom(imUserCustom);
        List<ImUserCustom> imUserCustomList = imUserService.selectImUserByIdAndName(imUserVo);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于在request的setAttribute，在jsp页面中通过imUserList获取数据
        modelAndView.addObject("imUserList",imUserCustomList);

        //指定视图
        modelAndView.setViewName("/WEB-INF/jsp/imUserEditMap.jsp");

        return modelAndView;
    }

    @RequestMapping("deleteImUser")
    public ModelAndView deleteImUser(String[] ids) throws Exception{

        System.out.println("========================");
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }
        return queryImUser();
    }

    @RequestMapping("editSelectImUser")
    public ModelAndView editSelectImUser(ImUserVo imUserVo) throws Exception{

        System.out.println("========================");
        List<ImUserCustom> imUserCustomList = imUserVo.getImUserCustomList();
        for(int i=0;i<imUserCustomList.size();i++){
            ImUserCustom imUserCustom = imUserCustomList.get(i);
            System.out.println(imUserCustom);
        }
        return queryImUser();
    }

    /**
     * 在需要添加校验的pojo前添加注解@Validated，在需要校验的pojo后边添加BindingResult bindingResult用于接收出差信息
     * 注意：@Validated和BindingResult bindingResult是配对出现的，并且在形参顺序是固定的。一前一后
     * @param imUserVo
     * @param bindingResult
     * @return
     * @throws Exception
     */
    @RequestMapping("editSelectImUserMap")
    public ModelAndView editSelectImUserMap(@Validated ImUserVo imUserVo, BindingResult bindingResult) throws Exception{

        if(bindingResult.hasErrors()){
            //输出错误信息
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError:allErrors){
                System.out.println(objectError.getDefaultMessage());
            }
        }
        System.out.println("========================");
        Map<String,Object> map = imUserVo.getImUserMap();
        Set<String> set = map.keySet();
        //for(int i=0;i<set.size();i++){
        //    map.get(set.iterator())
        //}

        return queryImUser();
    }

    @RequestMapping("editImUserValidate")
    public String editImUserValidate(Model model, @Validated(value = {Volidate2.class}) ImUser imUser, BindingResult bindingResult, MultipartFile pictureFile) throws Exception {
        //原文件名
        String pictureFileName = pictureFile.getOriginalFilename();
        String newFileName = UUID.randomUUID().toString() + pictureFileName.substring(pictureFileName.lastIndexOf("."));
        File file = new File("/Users/fanchengwei/Desktop/idea/pic/" + newFileName);
        if (!file.exists()){
            file.mkdir();
        }
        pictureFile.transferTo(file);

        if(bindingResult.hasErrors()){
            //输出错误信息
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError:allErrors){
                System.out.println("====汉字==="+objectError.getDefaultMessage());
            }
            model.addAttribute("allErrors",allErrors);
            return "/WEB-INF/jsp/imUser.jsp";
        }

        ImUserVo imUserVo = new ImUserVo();

        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setName("管");
        imUserVo.setImUserCustom(imUserCustom);
        List<ImUserCustom> imUserCustomList = imUserService.selectImUserByIdAndName(imUserVo);

        return "/WEB-INF/jsp/imUser.jsp";
    }

    /**
     * 返回ModelAndView：需要方法结束时，定义ModelAndView，将Model和view分别进行设置
     * 返回String：如果Controller方法返回String，表示返回逻辑视图名
     * 返回void：可以定义形参request和response，使用request或response指定响应结果
     * 1、使用request转向页面，如下：request.getRequestDispatcher("页面路径").forward(request,response);
     * 2、可以使用response页面重定向：response.sendRedirect("url");
     * 3、也可以通过response指定响应结果，例如响应json数据
     *      response.setCharacterEncoding("UTF-8");
     *      response.setContentType("application/json;charset=utf-8");
     *      response.getWriter().write("json串");
     * @param id
     * @return
     * @throws Exception
     */
    //@RequestMapping("/queryImUserById")
    //public ModelAndView queryImUserById(String id)throws Exception{
    //    ImUserVo imUserVo = new ImUserVo();
    //
    //    ImUserCustom imUserCustom = new ImUserCustom();
    //    imUserCustom.setId(id);
    //    imUserVo.setImUserCustom(imUserCustom);
    //    imUserCustom = imUserService.selectImUserById(imUserVo);
    //
    //    ModelAndView modelAndView = new ModelAndView();
    //    modelAndView.addObject("imUser",imUserCustom);
    //    modelAndView.setViewName("/WEB-INF/jsp/imUser.jsp");
    //    return modelAndView;
    //}

    /**
     * 返回String：如果Controller方法返回String，表示返回逻辑视图名
     * 通过形参的Model将model数据传到页面
     * @param model
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryImUserById")
    public String queryImUserById(Model model, String id)throws Exception{
        ImUserVo imUserVo = new ImUserVo();

        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setId(id);
        imUserVo.setImUserCustom(imUserCustom);
        imUserCustom = imUserService.selectImUserById(imUserVo);

        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("imUser",imUserCustom);
        //modelAndView.setViewName("/WEB-INF/jsp/imUser.jsp");

        //通过形参的Model将model数据传到页面
        model.addAttribute("imUser",imUserCustom);
        return "/WEB-INF/jsp/imUser.jsp";
    }

    /**
     * 限制http请求为post和get
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editImUser",method = {RequestMethod.POST,RequestMethod.GET})
    public String editImUser()throws Exception{

        //返回值为String时，可以设置重定向
        //redirect重定向特点：
        // 1、浏览器地址栏中的url会变化。
        // 2、修改提交的request数据无法传到重定向的地址。
        // 3、因为重定向后重新进行request（request无法进行共享）
        //return "redirect:queryImUser.action";
        //页面转发
        //forward页面转发特点：
        //1、浏览器地址栏不变
        //2、request可以共享
        return "forward:queryImUser.action";
    }
}
