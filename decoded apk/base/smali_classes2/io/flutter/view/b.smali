.class public final synthetic Lio/flutter/view/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/util/Predicate;


# static fields
.field public static final synthetic a:Lio/flutter/view/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/view/b;

    invoke-direct {v0}, Lio/flutter/view/b;-><init>()V

    sput-object v0, Lio/flutter/view/b;->a:Lio/flutter/view/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge;->a(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result p1

    return p1
.end method
