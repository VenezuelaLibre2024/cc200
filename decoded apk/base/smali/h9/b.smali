.class public final Lh9/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/b$a;
    }
.end annotation


# static fields
.field public static final b:Lh9/b;


# instance fields
.field public final a:Lh9/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh9/b$a;

    invoke-direct {v0}, Lh9/b$a;-><init>()V

    invoke-virtual {v0}, Lh9/b$a;->a()Lh9/b;

    move-result-object v0

    sput-object v0, Lh9/b;->b:Lh9/b;

    return-void
.end method

.method public constructor <init>(Lh9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/b;->a:Lh9/a;

    return-void
.end method

.method public static b()Lh9/b$a;
    .locals 1

    new-instance v0, Lh9/b$a;

    invoke-direct {v0}, Lh9/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lh9/a;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lh9/b;->a:Lh9/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lg9/i0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
