.class public final synthetic Lt8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# static fields
.field public static final synthetic a:Lt8/e;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt8/e;

    invoke-direct {v0}, Lt8/e;-><init>()V

    sput-object v0, Lt8/e;->a:Lt8/e;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Lq8/f;

    invoke-static {p1, p2}, Lt8/f;->d(Ljava/util/Map$Entry;Lq8/f;)V

    return-void
.end method
