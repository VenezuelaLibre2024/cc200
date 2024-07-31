.class public final Lw7/x;
.super Lw7/q;
.source ""


# instance fields
.field public i:Lw7/h;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw7/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/x;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lw7/h;
    .locals 1

    iget-object v0, p0, Lw7/x;->i:Lw7/h;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lw7/x;
    .locals 0

    iput-object p1, p0, Lw7/x;->j:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Lw7/h;)Lw7/x;
    .locals 0

    iput-object p1, p0, Lw7/x;->i:Lw7/h;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lw7/x;
    .locals 0

    iput-object p1, p0, Lw7/x;->k:Ljava/lang/String;

    return-object p0
.end method
