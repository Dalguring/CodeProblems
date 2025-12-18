class Solution {
    public int solution(int n, int w, int num) {
        int numLayer = layerOf(num, w);
        int numCol = colInLayer(num, w);

        int topLayer = layerOf(n, w);
        int base = topLayer - numLayer + 1;

        int topFilled = n % w;

        if (topFilled == 0) {
            return base;
        }

        int topColLimit = topFilled - 1;
        int topCol = colInLayer(n, w);
        boolean existsAbove = existsInTopLayer(numCol, w, topFilled, topLayer);

        return existsAbove ? base : base - 1;
    }

    private boolean existsInTopLayer(int col, int w, int topFilled, int topLayer) {
        if (topLayer % 2 == 0) { // 좌->우
            return col < topFilled;
        } else { // 우->좌
            return (w - col) <= topFilled;
        }
    }

    private int layerOf(int x, int w) {
        return (x - 1) / w + 1;
    }

    private int colInLayer(int x, int w) {
        int layer = layerOf(x, w);
        int offset = (x - 1) % w;
        return (layer % 2 == 0) ? offset : (w - 1 - offset);
    }
}