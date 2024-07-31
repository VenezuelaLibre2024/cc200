.class public final synthetic Ls3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/g;


# static fields
.field public static final synthetic h:Ls3/s;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/s;

    invoke-direct {v0}, Ls3/s;-><init>()V

    sput-object v0, Ls3/s;->h:Ls3/s;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lt3/n1;

    check-cast p1, Lp5/d;

    invoke-direct {v0, p1}, Lt3/n1;-><init>(Lp5/d;)V

    return-object v0
.end method
