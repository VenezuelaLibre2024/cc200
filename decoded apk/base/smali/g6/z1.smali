.class public final Lg6/z1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:Le6/b;


# direct methods
.method public constructor <init>(Le6/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lg6/z1;->b:Le6/b;

    iput p2, p0, Lg6/z1;->a:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lg6/z1;->a:I

    return v0
.end method

.method public final b()Le6/b;
    .locals 1

    iget-object v0, p0, Lg6/z1;->b:Le6/b;

    return-object v0
.end method
