.class public final Lo5/e0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final h:Lo5/e0$f;


# direct methods
.method public constructor <init>(Lo5/e0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/e0$g;->h:Lo5/e0$f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lo5/e0$g;->h:Lo5/e0$f;

    invoke-interface {v0}, Lo5/e0$f;->h()V

    return-void
.end method
