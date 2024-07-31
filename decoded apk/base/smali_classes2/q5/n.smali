.class public final synthetic Lq5/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:J

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/n;->h:Lq5/w$a;

    iput-wide p2, p0, Lq5/n;->i:J

    iput p4, p0, Lq5/n;->j:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq5/n;->h:Lq5/w$a;

    iget-wide v1, p0, Lq5/n;->i:J

    iget v3, p0, Lq5/n;->j:I

    invoke-static {v0, v1, v2, v3}, Lq5/w$a;->j(Lq5/w$a;JI)V

    return-void
.end method
