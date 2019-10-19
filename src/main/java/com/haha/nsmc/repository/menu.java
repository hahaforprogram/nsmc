package com.haha.nsmc.repository;

import java.util.List;

public class menu {


    /**
     * clearInfo : {"clearUrl":"api/clear.json"}
     * homeInfo : {"title":"首页","icon":"fa fa-home","href":"welcome"}
     * logoInfo : {"title":"mYhis","image":"images/logo.png","href":"welcome"}
     * menuInfo : {"system":{"title":"数据一览","icon":"fa fa-address-book","child":[{"title":"菜单管理","href":"menu.html","icon":"fa fa-window-maximize","target":"_self"},{"title":"系统设置","href":"setting.html","icon":"fa fa-gears","target":"_self"},{"title":"表格示例","href":"table.html","icon":"fa fa-file-text","target":"_self"},{"title":"表单示例","href":"","icon":"fa fa-calendar","target":"_self","child":[{"title":"普通表单","href":"form.html","icon":"fa fa-list-alt","target":"_self"},{"title":"分步表单","href":"form-step.html","icon":"fa fa-navicon","target":"_self"}]},{"title":"登录模板","href":"","icon":"fa fa-flag-o","target":"_self","child":[{"title":"登录","href":"login.html","icon":"fa fa-stumbleupon-circle","target":"_blank"},{"title":"登录-2","href":"login-2.html","icon":"fa fa-viacoin","target":"_blank"}]},{"title":"异常页面","href":"","icon":"fa fa-home","target":"_self","child":[{"title":"404页面","href":"404.html","icon":"fa fa-hourglass-end","target":"_self"}]},{"title":"其它界面","href":"","icon":"fa fa-snowflake-o","target":"","child":[{"title":"按钮示例","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"弹出层","href":"layer.html","icon":"fa fa-shield","target":"_self"}]}]},"doctor":{"title":"医生","icon":"fa fa-lemon-o","child":[{"title":"科室医生列表","href":"icon.html","icon":"fa fa-dot-circle-o","target":"_self"},{"title":"数据修改申请","href":"icon-picker.html","icon":"fa fa-adn","target":"_self"},{"title":"颜色选择","href":"color-select.html","icon":"fa fa-dashboard","target":"_self"},{"title":"下拉选择","href":"table-select.html","icon":"fa fa-angle-double-down","target":"_self"},{"title":"文件上传","href":"upload.html","icon":"fa fa-arrow-up","target":"_self"},{"title":"富文本编辑器","href":"editor.html","icon":"fa fa-edit","target":"_self"}]},"nurse":{"title":"护士","icon":"fa fa-slideshare","child":[{"title":"多级菜单","href":"","icon":"fa fa-meetup","target":"","child":[{"title":"按钮1","href":"button.html","icon":"fa fa-calendar","target":"_self","child":[{"title":"按钮2","href":"button.html","icon":"fa fa-snowflake-o","target":"_self","child":[{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]}]}]},{"title":"失效菜单","href":"error.html","icon":"fa fa-superpowers","target":"_self"}]}}
     */

    private ClearInfoBean clearInfo;
    private HomeInfoBean homeInfo;
    private LogoInfoBean logoInfo;
    private MenuInfoBean menuInfo;

    public ClearInfoBean getClearInfo() {
        return clearInfo;
    }

    public void setClearInfo(ClearInfoBean clearInfo) {
        this.clearInfo = clearInfo;
    }

    public HomeInfoBean getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(HomeInfoBean homeInfo) {
        this.homeInfo = homeInfo;
    }

    public LogoInfoBean getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(LogoInfoBean logoInfo) {
        this.logoInfo = logoInfo;
    }

    public MenuInfoBean getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(MenuInfoBean menuInfo) {
        this.menuInfo = menuInfo;
    }

    public static class ClearInfoBean {
        /**
         * clearUrl : api/clear.json
         */

        private String clearUrl;

        public String getClearUrl() {
            return clearUrl;
        }

        public void setClearUrl(String clearUrl) {
            this.clearUrl = clearUrl;
        }
    }

    public static class HomeInfoBean {
        /**
         * title : 首页
         * icon : fa fa-home
         * href : welcome
         */

        private String title;
        private String icon;
        private String href;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class LogoInfoBean {
        /**
         * title : mYhis
         * image : images/logo.png
         * href : welcome
         */

        private String title;
        private String image;
        private String href;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class MenuInfoBean {
        /**
         * system : {"title":"数据一览","icon":"fa fa-address-book","child":[{"title":"菜单管理","href":"menu.html","icon":"fa fa-window-maximize","target":"_self","child":[{"title":"普通表单","href":"form.html","icon":"fa fa-list-alt","target":"_self"},{"title":"分步表单","href":"form-step.html","icon":"fa fa-navicon","target":"_self"}]},{"title":"系统设置","href":"setting.html","icon":"fa fa-gears","target":"_self"},{"title":"表格示例","href":"table.html","icon":"fa fa-file-text","target":"_self"},{"title":"表单示例","href":"","icon":"fa fa-calendar","target":"_self","child":[{"title":"普通表单","href":"form.html","icon":"fa fa-list-alt","target":"_self"},{"title":"分步表单","href":"form-step.html","icon":"fa fa-navicon","target":"_self"}]},{"title":"登录模板","href":"","icon":"fa fa-flag-o","target":"_self","child":[{"title":"登录","href":"login.html","icon":"fa fa-stumbleupon-circle","target":"_blank"},{"title":"登录-2","href":"login-2.html","icon":"fa fa-viacoin","target":"_blank"}]},{"title":"异常页面","href":"","icon":"fa fa-home","target":"_self","child":[{"title":"404页面","href":"404.html","icon":"fa fa-hourglass-end","target":"_self"}]},{"title":"其它界面","href":"","icon":"fa fa-snowflake-o","target":"","child":[{"title":"按钮示例","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"弹出层","href":"layer.html","icon":"fa fa-shield","target":"_self"}]}]}
         * doctor : {"title":"医生","icon":"fa fa-lemon-o","child":[{"title":"科室医生列表","href":"icon.html","icon":"fa fa-dot-circle-o","target":"_self"},{"title":"数据修改申请","href":"icon-picker.html","icon":"fa fa-adn","target":"_self"},{"title":"颜色选择","href":"color-select.html","icon":"fa fa-dashboard","target":"_self"},{"title":"下拉选择","href":"table-select.html","icon":"fa fa-angle-double-down","target":"_self"},{"title":"文件上传","href":"upload.html","icon":"fa fa-arrow-up","target":"_self"},{"title":"富文本编辑器","href":"editor.html","icon":"fa fa-edit","target":"_self"}]}
         * nurse : {"title":"护士","icon":"fa fa-slideshare","child":[{"title":"多级菜单","href":"","icon":"fa fa-meetup","target":"","child":[{"title":"按钮1","href":"button.html","icon":"fa fa-calendar","target":"_self","child":[{"title":"按钮2","href":"button.html","icon":"fa fa-snowflake-o","target":"_self","child":[{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]}]}]},{"title":"失效菜单","href":"error.html","icon":"fa fa-superpowers","target":"_self"}]}
         */

        private SystemBean system;
        private DoctorBean doctor;
        private NurseBean nurse;

        public SystemBean getSystem() {
            return system;
        }

        public void setSystem(SystemBean system) {
            this.system = system;
        }

        public DoctorBean getDoctor() {
            return doctor;
        }

        public void setDoctor(DoctorBean doctor) {
            this.doctor = doctor;
        }

        public NurseBean getNurse() {
            return nurse;
        }

        public void setNurse(NurseBean nurse) {
            this.nurse = nurse;
        }

        public static class SystemBean {
            /**
             * title : 数据一览
             * icon : fa fa-address-book
             * child : [{"title":"菜单管理","href":"menu.html","icon":"fa fa-window-maximize","target":"_self"},{"title":"系统设置","href":"setting.html","icon":"fa fa-gears","target":"_self"},{"title":"表格示例","href":"table.html","icon":"fa fa-file-text","target":"_self"},{"title":"表单示例","href":"","icon":"fa fa-calendar","target":"_self","child":[{"title":"普通表单","href":"form.html","icon":"fa fa-list-alt","target":"_self"},{"title":"分步表单","href":"form-step.html","icon":"fa fa-navicon","target":"_self"}]},{"title":"登录模板","href":"","icon":"fa fa-flag-o","target":"_self","child":[{"title":"登录","href":"login.html","icon":"fa fa-stumbleupon-circle","target":"_blank"},{"title":"登录-2","href":"login-2.html","icon":"fa fa-viacoin","target":"_blank"}]},{"title":"异常页面","href":"","icon":"fa fa-home","target":"_self","child":[{"title":"404页面","href":"404.html","icon":"fa fa-hourglass-end","target":"_self"}]},{"title":"其它界面","href":"","icon":"fa fa-snowflake-o","target":"","child":[{"title":"按钮示例","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"弹出层","href":"layer.html","icon":"fa fa-shield","target":"_self"}]}]
             */

            private String title;
            private String icon;
            private List<ChildBeanX> child;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public List<ChildBeanX> getChild() {
                return child;
            }

            public void setChild(List<ChildBeanX> child) {
                this.child = child;
            }

            public static class ChildBeanX {
                /**
                 * title : 菜单管理
                 * href : menu.html
                 * icon : fa fa-window-maximize
                 * target : _self
                 * child : [{"title":"普通表单","href":"form.html","icon":"fa fa-list-alt","target":"_self"},{"title":"分步表单","href":"form-step.html","icon":"fa fa-navicon","target":"_self"}]
                 */

                private String title;
                private String href;
                private String icon;
                private String target;
                private List<ChildBean> child;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }

                public List<ChildBean> getChild() {
                    return child;
                }

                public void setChild(List<ChildBean> child) {
                    this.child = child;
                }

                public static class ChildBean {
                    /**
                     * title : 普通表单
                     * href : form.html
                     * icon : fa fa-list-alt
                     * target : _self
                     */

                    private String title;
                    private String href;
                    private String icon;
                    private String target;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getTarget() {
                        return target;
                    }

                    public void setTarget(String target) {
                        this.target = target;
                    }
                }
            }
        }

        public static class DoctorBean {
            /**
             * title : 医生
             * icon : fa fa-lemon-o
             * child : [{"title":"科室医生列表","href":"icon.html","icon":"fa fa-dot-circle-o","target":"_self"},{"title":"数据修改申请","href":"icon-picker.html","icon":"fa fa-adn","target":"_self"},{"title":"颜色选择","href":"color-select.html","icon":"fa fa-dashboard","target":"_self"},{"title":"下拉选择","href":"table-select.html","icon":"fa fa-angle-double-down","target":"_self"},{"title":"文件上传","href":"upload.html","icon":"fa fa-arrow-up","target":"_self"},{"title":"富文本编辑器","href":"editor.html","icon":"fa fa-edit","target":"_self"}]
             */

            private String title;
            private String icon;
            private List<ChildBeanXX> child;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public List<ChildBeanXX> getChild() {
                return child;
            }

            public void setChild(List<ChildBeanXX> child) {
                this.child = child;
            }

            public static class ChildBeanXX {
                /**
                 * title : 科室医生列表
                 * href : icon.html
                 * icon : fa fa-dot-circle-o
                 * target : _self
                 */

                private String title;
                private String href;
                private String icon;
                private String target;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }
            }
        }

        public static class NurseBean {
            /**
             * title : 护士
             * icon : fa fa-slideshare
             * child : [{"title":"多级菜单","href":"","icon":"fa fa-meetup","target":"","child":[{"title":"按钮1","href":"button.html","icon":"fa fa-calendar","target":"_self","child":[{"title":"按钮2","href":"button.html","icon":"fa fa-snowflake-o","target":"_self","child":[{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]}]}]},{"title":"失效菜单","href":"error.html","icon":"fa fa-superpowers","target":"_self"}]
             */

            private String title;
            private String icon;
            private List<ChildBeanXXXXXX> child;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public List<ChildBeanXXXXXX> getChild() {
                return child;
            }

            public void setChild(List<ChildBeanXXXXXX> child) {
                this.child = child;
            }

            public static class ChildBeanXXXXXX {
                /**
                 * title : 多级菜单
                 * href :
                 * icon : fa fa-meetup
                 * target :
                 * child : [{"title":"按钮1","href":"button.html","icon":"fa fa-calendar","target":"_self","child":[{"title":"按钮2","href":"button.html","icon":"fa fa-snowflake-o","target":"_self","child":[{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]}]}]
                 */

                private String title;
                private String href;
                private String icon;
                private String target;
                private List<ChildBeanXXXXX> child;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }

                public List<ChildBeanXXXXX> getChild() {
                    return child;
                }

                public void setChild(List<ChildBeanXXXXX> child) {
                    this.child = child;
                }

                public static class ChildBeanXXXXX {
                    /**
                     * title : 按钮1
                     * href : button.html
                     * icon : fa fa-calendar
                     * target : _self
                     * child : [{"title":"按钮2","href":"button.html","icon":"fa fa-snowflake-o","target":"_self","child":[{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]}]
                     */

                    private String title;
                    private String href;
                    private String icon;
                    private String target;
                    private List<ChildBeanXXXX> child;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getTarget() {
                        return target;
                    }

                    public void setTarget(String target) {
                        this.target = target;
                    }

                    public List<ChildBeanXXXX> getChild() {
                        return child;
                    }

                    public void setChild(List<ChildBeanXXXX> child) {
                        this.child = child;
                    }

                    public static class ChildBeanXXXX {
                        /**
                         * title : 按钮2
                         * href : button.html
                         * icon : fa fa-snowflake-o
                         * target : _self
                         * child : [{"title":"按钮3","href":"button.html","icon":"fa fa-snowflake-o","target":"_self"},{"title":"表单4","href":"form.html","icon":"fa fa-calendar","target":"_self"}]
                         */

                        private String title;
                        private String href;
                        private String icon;
                        private String target;
                        private List<ChildBeanXXX> child;

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getHref() {
                            return href;
                        }

                        public void setHref(String href) {
                            this.href = href;
                        }

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }

                        public String getTarget() {
                            return target;
                        }

                        public void setTarget(String target) {
                            this.target = target;
                        }

                        public List<ChildBeanXXX> getChild() {
                            return child;
                        }

                        public void setChild(List<ChildBeanXXX> child) {
                            this.child = child;
                        }

                        public static class ChildBeanXXX {
                            /**
                             * title : 按钮3
                             * href : button.html
                             * icon : fa fa-snowflake-o
                             * target : _self
                             */

                            private String title;
                            private String href;
                            private String icon;
                            private String target;

                            public String getTitle() {
                                return title;
                            }

                            public void setTitle(String title) {
                                this.title = title;
                            }

                            public String getHref() {
                                return href;
                            }

                            public void setHref(String href) {
                                this.href = href;
                            }

                            public String getIcon() {
                                return icon;
                            }

                            public void setIcon(String icon) {
                                this.icon = icon;
                            }

                            public String getTarget() {
                                return target;
                            }

                            public void setTarget(String target) {
                                this.target = target;
                            }
                        }
                    }
                }
            }
        }
    }
}
