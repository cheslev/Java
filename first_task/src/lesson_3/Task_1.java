package lesson_3;

class Study {

    private String course;

    public Study(String course){
    this.course = course;
}
    //TODO
    String getCourse(){
        return course;
    }
    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        //TODO
        Study study1 = new Study("Learning Java is Easy!");
        System.out.println(study1.getCourse());
    }
}

