.class public Lf6/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/e$a$a;
    }
.end annotation


# static fields
.field public static final c:Lf6/e$a;


# instance fields
.field public final a:Lg6/t;

.field public final b:Landroid/os/Looper;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf6/e$a$a;

    invoke-direct {v0}, Lf6/e$a$a;-><init>()V

    invoke-virtual {v0}, Lf6/e$a$a;->a()Lf6/e$a;

    move-result-object v0

    sput-object v0, Lf6/e$a;->c:Lf6/e$a;

    return-void
.end method

.method public constructor <init>(Lg6/t;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/e$a;->a:Lg6/t;

    iput-object p3, p0, Lf6/e$a;->b:Landroid/os/Looper;

    return-void
.end method

.method public synthetic constructor <init>(Lg6/t;Landroid/accounts/Account;Landroid/os/Looper;Lf6/u;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Lf6/e$a;-><init>(Lg6/t;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
