.class public Lw7/v0;
.super Lw7/i0;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lw7/y0;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw7/y0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lw7/i0;-><init>()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/v0;->a:Ljava/lang/String;

    iput-object p2, p0, Lw7/v0;->b:Lw7/y0;

    iput-object p3, p0, Lw7/v0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lw7/y0;
    .locals 1

    iget-object v0, p0, Lw7/v0;->b:Lw7/y0;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/v0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/v0;->a:Ljava/lang/String;

    return-object v0
.end method
