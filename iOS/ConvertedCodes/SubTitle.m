//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: ../android/app/src/main/java/net/iseteki/j2objcsample/library/SubTitle.java
//


#include "J2ObjC_source.h"
#include "SubTitle.h"

@implementation EBIAnimeSubTitle

- (instancetype)initWithCountNumber:(jint)countNumber
                               name:(NSString *)name {
  EBIAnimeSubTitle_initWithCountNumber_name_(self, countNumber, name);
  return self;
}

- (jint)countNumber {
  return countNumber_;
}

- (void)setCountNumber:(jint)countNumber {
  self->countNumber_ = countNumber;
}

- (NSString *)name {
  return name_;
}

- (void)setName:(NSString *)name {
  self->name_ = name;
}

- (NSString *)description {
  return JreStrcat("$I$$$", @"SubTitle{countNumber=", countNumber_, @", name='", name_, @"'}");
}

@end

void EBIAnimeSubTitle_initWithCountNumber_name_(EBIAnimeSubTitle *self, jint countNumber, NSString *name) {
  (void) NSObject_init(self);
  self->countNumber_ = countNumber;
  self->name_ = name;
}

EBIAnimeSubTitle *new_EBIAnimeSubTitle_initWithCountNumber_name_(jint countNumber, NSString *name) {
  EBIAnimeSubTitle *self = [EBIAnimeSubTitle alloc];
  EBIAnimeSubTitle_initWithCountNumber_name_(self, countNumber, name);
  return self;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(EBIAnimeSubTitle)
