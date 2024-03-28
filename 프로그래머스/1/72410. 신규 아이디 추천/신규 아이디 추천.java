class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^a-z0-9\\-_.]", "")
                .replaceAll("[.]+", ".")
                .replaceAll("^\\.|\\.$", "");

        new_id = new_id.isEmpty() ? new_id = "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("\\.$", "") :
                new_id.length() <= 2 ? new_id.concat(new_id
                                                     .substring(new_id.length() - 1)
                                                     .repeat(3 - new_id.length()))      : new_id;
        return new_id;
    }
}