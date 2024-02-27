function take(data: number[], count: number, index = 0): number[] {
  if (index < data.length && index < count) {
    const elements = take(data, count, index + 1);

    const dataItem = data[index];
    console.log(dataItem);
    return [dataItem].concat(elements);
  }
  return [];
}

const takeTwo = take([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 2);
console.log(takeTwo);
