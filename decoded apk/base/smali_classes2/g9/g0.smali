.class public final synthetic Lg9/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/g;


# static fields
.field public static final synthetic a:Lg9/g0;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lg9/g0;

    invoke-direct {v0}, Lg9/g0;-><init>()V

    sput-object v0, Lg9/g0;->a:Lg9/g0;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh9/b;

    invoke-virtual {p1}, Lh9/b;->c()[B

    move-result-object p1

    return-object p1
.end method
