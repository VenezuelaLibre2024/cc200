.class public abstract Lf1/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroidx/lifecycle/k;)Lf1/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/lifecycle/k;",
            ":",
            "Landroidx/lifecycle/i0;",
            ">(TT;)",
            "Lf1/a;"
        }
    .end annotation

    new-instance v0, Lf1/b;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/i0;

    invoke-interface {v1}, Landroidx/lifecycle/i0;->getViewModelStore()Landroidx/lifecycle/h0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lf1/b;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/h0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c(ILandroid/os/Bundle;Lf1/a$a;)Lg1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Lf1/a$a<",
            "TD;>;)",
            "Lg1/b<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract d()V
.end method
