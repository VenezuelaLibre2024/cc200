.class public final Ls3/s2$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/s2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lu4/t;

.field public final b:Lu4/t$c;

.field public final c:Ls3/s2$a;


# direct methods
.method public constructor <init>(Lu4/t;Lu4/t$c;Ls3/s2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/s2$b;->a:Lu4/t;

    iput-object p2, p0, Ls3/s2$b;->b:Lu4/t$c;

    iput-object p3, p0, Ls3/s2$b;->c:Ls3/s2$a;

    return-void
.end method
