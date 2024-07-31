.class public abstract Lia/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lia/h;


# direct methods
.method public constructor <init>(Lia/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/b;->a:Lia/h;

    return-void
.end method


# virtual methods
.method public abstract a(Lia/h;)Lia/b;
.end method

.method public abstract b()Loa/b;
.end method

.method public abstract c(ILoa/a;)Loa/a;
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lia/b;->a:Lia/h;

    invoke-virtual {v0}, Lia/h;->a()I

    move-result v0

    return v0
.end method

.method public final e()Lia/h;
    .locals 1

    iget-object v0, p0, Lia/b;->a:Lia/h;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lia/b;->a:Lia/h;

    invoke-virtual {v0}, Lia/h;->d()I

    move-result v0

    return v0
.end method
