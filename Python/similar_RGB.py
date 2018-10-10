def find_similar_in_sorted_colors(color, colors):
    start = 0
    end = len(colors) - 1
    mid = 0
    if color < colors[0]:
        return 0
    if color > colors[-1]:
        return len(colors) - 1
    while start < end:
        mid = (start + end) // 2
        if colors[mid] == color:
            return mid
        elif colors[mid] < color:
            if mid < len(colors) - 1 and colors[mid + 1] > color:
                return find_closed_from_two(colors, mid, mid + 1, color)
            start = mid + 1
        else:
            if mid > 0 and colors[mid - 1] < color:
                return find_closed_from_two(colors, mid - 1, mid, color)
            end = mid
    print("Loop end..")
    print(mid)
    return mid

def find_closed_from_two(colors, left, right, target):
    if target - colors[left] > colors[right] - target:
        return right
    else:
        return left

def main():
    rgb_str = "22f966"
    color_list = ["00", "11", "22", "33", "44", "55", "66", "77", "88", "99", "AA", "BB", "CC", "DD", "EE", "FF"]
    similar_option_int = list(map(lambda c: int(c, 16), color_list))

    similar_r = find_similar_in_sorted_colors(int(rgb_str[:2], 16), similar_option_int)
    similar_g = find_similar_in_sorted_colors(int(rgb_str[2:4], 16), similar_option_int)
    similar_b = find_similar_in_sorted_colors(int(rgb_str[4:], 16), similar_option_int)
    print (color_list[similar_r] + color_list[similar_g] + color_list[similar_b])
    # print (color_list[similar_r] + color_list[similar_g] + color_list[similar_b])

main()