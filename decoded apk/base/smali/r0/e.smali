.class public final Lr0/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lr0/e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr0/e$a;-><init>(Ltd/g;)V

    sput-object v0, Lr0/e;->a:Lr0/e$a;

    return-void
.end method
