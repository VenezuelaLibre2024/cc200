.class public final synthetic Lw3/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/b0$c;


# static fields
.field public static final synthetic a:Lw3/e0;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/e0;

    invoke-direct {v0}, Lw3/e0;-><init>()V

    sput-object v0, Lw3/e0;->a:Lw3/e0;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;)Lw3/b0;
    .locals 0

    invoke-static {p1}, Lw3/f0;->n(Ljava/util/UUID;)Lw3/b0;

    move-result-object p1

    return-object p1
.end method
