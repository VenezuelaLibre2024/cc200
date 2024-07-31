.class public interface abstract Lc2/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/m$b;
    }
.end annotation


# static fields
.field public static final a:Lc2/m$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:Lc2/m$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc2/m$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc2/m$b$c;-><init>(Lc2/m$a;)V

    sput-object v0, Lc2/m;->a:Lc2/m$b$c;

    new-instance v0, Lc2/m$b$b;

    invoke-direct {v0, v1}, Lc2/m$b$b;-><init>(Lc2/m$a;)V

    sput-object v0, Lc2/m;->b:Lc2/m$b$b;

    return-void
.end method
