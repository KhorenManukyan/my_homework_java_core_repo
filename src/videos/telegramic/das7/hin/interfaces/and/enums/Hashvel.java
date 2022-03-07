package videos.telegramic.das7.hin.interfaces.and.enums;

public enum Hashvel {
    Gumar{
        public float hashvel(float tiv1, float tiv2){
            return tiv1 + tiv2;
        }
    },
    Bazmapatkum{
        public float hashvel(float tiv1, float tiv2){
            return tiv1 * tiv2;
        }
    },
    Hanum{
        public float hashvel(float tiv1, float tiv2){
            return tiv1 - tiv2;
        }
    },
    Bajanum{
        public float hashvel(float tiv1, float tiv2){
            return tiv1 / tiv2;
        }
    };

    public abstract float hashvel(float tiv1, float tiv2);
}
