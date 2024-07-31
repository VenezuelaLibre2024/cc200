.class public final Lj3/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/b$a;
    }
.end annotation


# static fields
.field public static final b:Lj3/b;


# instance fields
.field public final a:Lj3/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b$a;

    invoke-direct {v0}, Lj3/b$a;-><init>()V

    invoke-virtual {v0}, Lj3/b$a;->a()Lj3/b;

    move-result-object v0

    sput-object v0, Lj3/b;->b:Lj3/b;

    return-void
.end method

.method public constructor <init>(Lj3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/b;->a:Lj3/e;

    return-void
.end method

.method public static b()Lj3/b$a;
    .locals 1

    new-instance v0, Lj3/b$a;

    invoke-direct {v0}, Lj3/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lj3/e;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lj3/b;->a:Lj3/e;

    return-object v0
.end method
