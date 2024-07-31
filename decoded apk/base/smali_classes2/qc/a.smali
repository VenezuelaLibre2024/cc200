.class public Lqc/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lqc/a;


# instance fields
.field public a:Lre/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqc/a;

    invoke-direct {v0}, Lqc/a;-><init>()V

    sput-object v0, Lqc/a;->b:Lqc/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lre/y;
    .locals 1

    iget-object v0, p0, Lqc/a;->a:Lre/y;

    if-nez v0, :cond_0

    new-instance v0, Lre/y;

    invoke-direct {v0}, Lre/y;-><init>()V

    iput-object v0, p0, Lqc/a;->a:Lre/y;

    :cond_0
    iget-object v0, p0, Lqc/a;->a:Lre/y;

    return-object v0
.end method
