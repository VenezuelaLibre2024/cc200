.class public final Ln/w$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Landroid/view/DragEvent;Landroid/widget/TextView;Landroid/app/Activity;)Z
    .locals 1

    invoke-virtual {p2, p0}, Landroid/app/Activity;->requestDragAndDropPermissions(Landroid/view/DragEvent;)Landroid/view/DragAndDropPermissions;

    invoke-virtual {p0}, Landroid/view/DragEvent;->getX()F

    move-result p2

    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->getOffsetForPosition(FF)I

    move-result p2

    invoke-virtual {p1}, Landroid/widget/TextView;->beginBatchEdit()V

    :try_start_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spannable;

    invoke-static {v0, p2}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    new-instance p2, Lk0/c$a;

    invoke-virtual {p0}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    move-result-object p0

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lk0/c$a;-><init>(Landroid/content/ClipData;I)V

    invoke-virtual {p2}, Lk0/c$a;->a()Lk0/c;

    move-result-object p0

    invoke-static {p1, p0}, Lk0/b0;->P(Landroid/view/View;Lk0/c;)Lk0/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/widget/TextView;->endBatchEdit()V

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Landroid/widget/TextView;->endBatchEdit()V

    throw p0
.end method

.method public static b(Landroid/view/DragEvent;Landroid/view/View;Landroid/app/Activity;)Z
    .locals 1

    invoke-virtual {p2, p0}, Landroid/app/Activity;->requestDragAndDropPermissions(Landroid/view/DragEvent;)Landroid/view/DragAndDropPermissions;

    new-instance p2, Lk0/c$a;

    invoke-virtual {p0}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    move-result-object p0

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lk0/c$a;-><init>(Landroid/content/ClipData;I)V

    invoke-virtual {p2}, Lk0/c$a;->a()Lk0/c;

    move-result-object p0

    invoke-static {p1, p0}, Lk0/b0;->P(Landroid/view/View;Lk0/c;)Lk0/c;

    const/4 p0, 0x1

    return p0
.end method
