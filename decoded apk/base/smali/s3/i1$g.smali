.class public final Ls3/i1$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Lu4/t$b;

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Lu4/t$b;JJZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/i1$g;->a:Lu4/t$b;

    iput-wide p2, p0, Ls3/i1$g;->b:J

    iput-wide p4, p0, Ls3/i1$g;->c:J

    iput-boolean p6, p0, Ls3/i1$g;->d:Z

    iput-boolean p7, p0, Ls3/i1$g;->e:Z

    iput-boolean p8, p0, Ls3/i1$g;->f:Z

    return-void
.end method
