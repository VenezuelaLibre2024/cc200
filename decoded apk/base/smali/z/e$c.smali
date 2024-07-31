.class public final Lz/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[Lz/e$d;


# direct methods
.method public constructor <init>([Lz/e$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e$c;->a:[Lz/e$d;

    return-void
.end method


# virtual methods
.method public a()[Lz/e$d;
    .locals 1

    iget-object v0, p0, Lz/e$c;->a:[Lz/e$d;

    return-object v0
.end method
