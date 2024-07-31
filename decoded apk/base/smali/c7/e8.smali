.class public final synthetic Lc7/e8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public synthetic a:Lc7/w7;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/e8;->a:Lc7/w7;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lc7/e8;->a:Lc7/w7;

    invoke-virtual {v0, p1, p2}, Lc7/w7;->A(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
