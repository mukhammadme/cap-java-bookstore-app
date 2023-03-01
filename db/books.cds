namespace com.linc.bookstore;

entity Books {
  key id : Integer;
  title  : localized String(100);
  descr  : localized String(1000);
  author : String(100);
  genre  : String(100);
};
