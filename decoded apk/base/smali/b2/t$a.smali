.class public Lb2/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lb2/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/a0;

    invoke-static {}, Lb2/t;->d()Lb2/v;

    move-result-object v1

    invoke-interface {v1}, Lb2/v;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Lb2/a0;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Lb2/t$a;->a:Lb2/a0;

    return-void
.end method
