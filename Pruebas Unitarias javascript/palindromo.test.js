const isPalindrome = require('./palindromo')
 
test('Deteccion de palindromo', () => {
  expect(isPalindrome('palindromo')).toBe(false)
  expect(isPalindrome('')).toBe(true)
  expect(isPalindrome('a')).toBe(true)
  expect(isPalindrome('gg')).toBe(true)
  expect(isPalindrome('pop')).toBe(true)
  expect(isPalindrome('1212')).toBe(false)
})