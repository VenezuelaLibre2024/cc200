.class public final synthetic Lk8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/g;


# static fields
.field public static final synthetic a:Lk8/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk8/a;

    invoke-direct {v0}, Lk8/a;-><init>()V

    sput-object v0, Lk8/a;->a:Lk8/a;

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

    check-cast p1, Lg8/f0;

    invoke-static {p1}, Lk8/b;->a(Lg8/f0;)[B

    move-result-object p1

    return-object p1
.end method
