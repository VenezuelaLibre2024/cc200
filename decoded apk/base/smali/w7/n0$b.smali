.class public Lw7/n0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/n0$b;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lw7/o1;)V
    .locals 0

    invoke-direct {p0, p1}, Lw7/n0$b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lw7/h;
    .locals 4

    iget-object v0, p0, Lw7/n0$b;->a:Ljava/lang/String;

    iget-object v1, p0, Lw7/n0$b;->b:Ljava/lang/String;

    iget-object v2, p0, Lw7/n0$b;->c:Ljava/lang/String;

    iget-object v3, p0, Lw7/n0$b;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lw7/z1;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw7/z1;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lw7/n0$b;
    .locals 0

    iput-object p1, p0, Lw7/n0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lw7/n0$b;
    .locals 0

    iput-object p1, p0, Lw7/n0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lw7/n0$b;
    .locals 0

    iput-object p1, p0, Lw7/n0$b;->b:Ljava/lang/String;

    iput-object p2, p0, Lw7/n0$b;->d:Ljava/lang/String;

    return-object p0
.end method
