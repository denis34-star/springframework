package ru.geekbrains.lesson4;

import com.sun.deploy.si.SingleInstanceImpl;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) { SpringApplication.run(BlogApplication.class, args);

    }

    private static class SpringApplication {
        public static void run(Class<BlogApplication> blogApplicationClass, String[] args) {
        }
    }
}
