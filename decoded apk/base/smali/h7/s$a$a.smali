.class public Lh7/s$a$a;
.super Lh7/s$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/s$a;->b(Lh7/s;Ljava/lang/CharSequence;)Lh7/s$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lh7/s$a;


# direct methods
.method public constructor <init>(Lh7/s$a;Lh7/s;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lh7/s$a$a;->o:Lh7/s$a;

    invoke-direct {p0, p2, p3}, Lh7/s$b;-><init>(Lh7/s;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public f(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public g(I)I
    .locals 2

    iget-object v0, p0, Lh7/s$a$a;->o:Lh7/s$a;

    iget-object v0, v0, Lh7/s$a;->a:Lh7/d;

    iget-object v1, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lh7/d;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
