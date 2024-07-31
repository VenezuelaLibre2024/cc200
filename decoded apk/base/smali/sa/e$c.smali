.class public final Lsa/e$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsa/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public final b:[Lsa/e$b;


# direct methods
.method public constructor <init>(ILsa/e$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsa/e$c;->a:I

    const/4 p1, 0x1

    new-array p1, p1, [Lsa/e$b;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    iput-object p1, p0, Lsa/e$c;->b:[Lsa/e$b;

    return-void
.end method

.method public synthetic constructor <init>(ILsa/e$b;Lsa/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsa/e$c;-><init>(ILsa/e$b;)V

    return-void
.end method

.method public constructor <init>(ILsa/e$b;Lsa/e$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsa/e$c;->a:I

    const/4 p1, 0x2

    new-array p1, p1, [Lsa/e$b;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const/4 p2, 0x1

    aput-object p3, p1, p2

    iput-object p1, p0, Lsa/e$c;->b:[Lsa/e$b;

    return-void
.end method

.method public synthetic constructor <init>(ILsa/e$b;Lsa/e$b;Lsa/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lsa/e$c;-><init>(ILsa/e$b;Lsa/e$b;)V

    return-void
.end method


# virtual methods
.method public a()[Lsa/e$b;
    .locals 1

    iget-object v0, p0, Lsa/e$c;->b:[Lsa/e$b;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lsa/e$c;->a:I

    return v0
.end method
