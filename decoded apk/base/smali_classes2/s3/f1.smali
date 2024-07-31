.class public final synthetic Ls3/f1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# static fields
.field public static final synthetic a:Ls3/f1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/f1;

    invoke-direct {v0}, Ls3/f1;-><init>()V

    sput-object v0, Ls3/f1;->a:Ls3/f1;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ls3/b3$d;

    invoke-interface {p1}, Ls3/b3$d;->onRenderedFirstFrame()V

    return-void
.end method
