public class House{
    private final int bedrooms; // required parameter
    private final int bathrooms;
    private int garage = 0; // optional
    private final int basement = 0;

    public House(Builder builder) {
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
    }
    public static class Builder {
        private final int bedrooms; // required parameter
        private final int bathrooms;
        private int garage = 0; // optional
        private int basement = 0;

        public Builder (int bedrooms, int bathrooms){
            this.bedrooms = bedrooms;
            this.bathrooms = bathrooms;
        }

        public Builder createGarage(){
            this.garage = 1;
            return this;
        }

        public Builder createBasement(){
            this.basement = 1;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

}
