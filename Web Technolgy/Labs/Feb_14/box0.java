package Feb_14;

class box0 {
    float width;
    float height;
    float length;

    void setdim(float w, float h, float l) {
        width = w;
        height = h;
        length = l;
    }

    void volume() {
        System.out.println("Volume:" + length *width*height);
    }
}