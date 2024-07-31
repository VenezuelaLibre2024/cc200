.class public final synthetic Lo5/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/p;


# static fields
.field public static final synthetic h:Lo5/t;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/t;

    invoke-direct {v0}, Lo5/t;-><init>()V

    sput-object v0, Lo5/t;->h:Lo5/t;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lo5/s$c;->g(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
