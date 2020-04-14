package com.leetcode.problems.algorytms.easy;

import com.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class BinaryTreeLevelOrderTraversal_II {

    List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> layer = new LinkedList<>();
        layer.add(root);

        while (!layer.isEmpty()) {
            int items = layer.size();
            List<Integer> values = new ArrayList<>(items);
            for (int i = 0; i < items; i++) {
                TreeNode node = layer.poll();
                if (node == null) continue;
                values.add(node.val);
                layer.add(node.left);
                layer.add(node.right);
            }
            if (!values.isEmpty()) result.addFirst(values);
        }

        return result;
    }
}
