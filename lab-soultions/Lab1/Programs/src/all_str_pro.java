public class all_str_pro {
    public void get_index(String str){
        System.out.println(str +" 's 1st character is " +str.charAt(1));
    }
    public void string_includes(String str){
        System.out.println(str +"Contains(java)"+ str.contains("java"));
    }
    public void change_To_Upper(String str){
        System.out.println(str +"'s upper case ="+ str.toUpperCase());
    }
    public void change_To_Lower(String str){
        System.out.println(str +"'s lower case ="+ str.toLowerCase());
    }
    public void find_len(String str){
        System.out.println(str +"Len ="+ str.length());
    }
    public void find_index(String str){
        System.out.println(str +"'s index of java ="+ str.indexOf("Java"));
    }
    public void find_str_equal(String str1, String str2){
        System.out.println("is str1 = str2"+ str1.equals(str2));
    }
    public void remove_st_end_space(String str){
        System.out.println("After removing spaces"+ str.trim());
    }
    public void find_sub_string(String str){
        System.out.println(str +"'s sub string(2,7)"+ str.substring(2,7));
    }
    public void find_last_index(String str){
        System.out.println(str +"'s last index of l ="+ str.lastIndexOf("l"));
    }
    public void test_equal_ignor_case(String str1, String str2){
        System.out.println("equals or not="+ str1.equalsIgnoreCase(str2));
    }
    public void join_sen(){
        String join = String.join("-","java","C++","Python");
        System.out.println("joined string="+join );
    }



    public static void main(String[] args) {
        all_str_pro a= new all_str_pro();
        String str1= " Hello Java World  ";
        String str2 =" hello java world  ";
        a.get_index(str1);
        a.string_includes(str1);
        a.change_To_Lower(str1);
        a.change_To_Upper(str2);
        a.find_len(str1);
        a.find_index(str1);
        a.find_sub_string(str1);
        a.find_str_equal(str1,str2);
        a.find_last_index(str2);
        a.test_equal_ignor_case(str1,str2);
        a.join_sen();

    }
}
