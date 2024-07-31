.class public final synthetic Lt3/o1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/u;


# static fields
.field public static final synthetic h:Lt3/o1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt3/o1;

    invoke-direct {v0}, Lt3/o1;-><init>()V

    sput-object v0, Lt3/o1;->h:Lt3/o1;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lt3/p1;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
