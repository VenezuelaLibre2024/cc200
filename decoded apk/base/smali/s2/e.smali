.class public Ls2/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/StackTraceElement;


# direct methods
.method public constructor <init>(Ljava/lang/StackTraceElement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/e;->a:Ljava/lang/StackTraceElement;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/StackTraceElement;
    .locals 1

    iget-object v0, p0, Ls2/e;->a:Ljava/lang/StackTraceElement;

    return-object v0
.end method
