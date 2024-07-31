.class public final synthetic Ldd/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/util/ViewUtils$ViewVisitor;


# static fields
.field public static final synthetic a:Ldd/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ldd/b;

    invoke-direct {v0}, Ldd/b;-><init>()V

    sput-object v0, Ldd/b;->a:Ldd/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run(Landroid/view/View;)Z
    .locals 0

    invoke-static {p1}, Lio/flutter/util/ViewUtils;->a(Landroid/view/View;)Z

    move-result p1

    return p1
.end method
