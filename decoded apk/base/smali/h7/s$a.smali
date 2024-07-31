.class public Lh7/s$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/s;->e(Lh7/d;)Lh7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh7/d;


# direct methods
.method public constructor <init>(Lh7/d;)V
    .locals 0

    iput-object p1, p0, Lh7/s$a;->a:Lh7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lh7/s;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh7/s$a;->b(Lh7/s;Ljava/lang/CharSequence;)Lh7/s$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lh7/s;Ljava/lang/CharSequence;)Lh7/s$b;
    .locals 1

    new-instance v0, Lh7/s$a$a;

    invoke-direct {v0, p0, p1, p2}, Lh7/s$a$a;-><init>(Lh7/s$a;Lh7/s;Ljava/lang/CharSequence;)V

    return-object v0
.end method
