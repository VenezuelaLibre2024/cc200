.class public final Ls3/w0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/e2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ls3/u3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ls3/u3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/w0$e;->a:Ljava/lang/Object;

    iput-object p2, p0, Ls3/w0$e;->b:Ls3/u3;

    return-void
.end method

.method public static synthetic a(Ls3/w0$e;Ls3/u3;)Ls3/u3;
    .locals 0

    iput-object p1, p0, Ls3/w0$e;->b:Ls3/u3;

    return-object p1
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls3/w0$e;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ls3/u3;
    .locals 1

    iget-object v0, p0, Ls3/w0$e;->b:Ls3/u3;

    return-object v0
.end method
