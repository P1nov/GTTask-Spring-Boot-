package com.leiyonglin.Interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new SportInterceptor()).addPathPatterns("/user/**", "/moment/**");
    }
//
//    @Value("${gt.imagepath}")
//    private String imagePath;

//    @Bean
//    public MultipartConfigElement multipartConfigElement(){
//
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize("10MB");
//        factory.setMaxRequestSize("100MB");
//        return factory.createMultipartConfig();
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if (imagePath.equals("") || imagePath.equals("${gt.imagepath}")){
//
//            String imageUrl = WebAppConfig.class.getClassLoader().getResource("").getPath();
//            System.out.println("上传imagesPath = " + imageUrl + "\n");
//
//            if(imageUrl.indexOf(".jar") > 0){
//
//                imageUrl = imageUrl.substring(0, imageUrl.indexOf(".jar"));
//            }else if (imageUrl.indexOf("classes") > 0){
//
//                imageUrl = imageUrl.substring(0, imageUrl.indexOf("classes"));
//            }
//
//            imageUrl = imageUrl.substring(0, imageUrl.lastIndexOf("/")) + "/images/";
//            imagePath = imageUrl;
//        }
//
//        System.out.print("imagesPath============="+imagePath+"\n");
//        //LoggerFactory.getLogger(WebAppConfig.class).info("imagesPath============="+mImagesPath+"\n");
//        registry.addResourceHandler("/images/**").addResourceLocations(imagePath);
//
//        super.addResourceHandlers(registry);
//    }
}
