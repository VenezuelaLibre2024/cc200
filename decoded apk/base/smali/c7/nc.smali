.class public final Lc7/nc;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p6}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc7/nc;->a:Ljava/lang/String;

    iput-object p2, p0, Lc7/nc;->b:Ljava/lang/String;

    iput-object p3, p0, Lc7/nc;->c:Ljava/lang/String;

    iput-wide p4, p0, Lc7/nc;->d:J

    iput-object p6, p0, Lc7/nc;->e:Ljava/lang/Object;

    return-void
.end method
