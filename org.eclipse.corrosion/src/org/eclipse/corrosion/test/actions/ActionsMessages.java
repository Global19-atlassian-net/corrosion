/*********************************************************************
 * Copyright (c) 2020 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.corrosion.test.actions;

import org.eclipse.osgi.util.NLS;

public class ActionsMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.corrosion.test.actions.ActionsMessages"; //$NON-NLS-1$
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, ActionsMessages.class);
	}

	private ActionsMessages() {
	}

	public static String OpenInEditorAction_text;
	public static String OpenInEditorAction_tooltip;

	// TODO cleanup the following:
	public static String CopySelectedMessagesAction_text;
	public static String CopySelectedMessagesAction_tooltip;
	public static String CopySelectedTestsAction_text;
	public static String CopySelectedTestsAction_tooltip;
	public static String HistoryAction_dialog_button_remove;
	public static String HistoryAction_dialog_button_remove_all;
	public static String HistoryAction_dialog_limit_label;
	public static String HistoryAction_dialog_limit_label_error;
	public static String HistoryAction_dialog_list_title;
	public static String HistoryAction_dialog_title;
	public static String HistoryAction_history_item_clear_text;
	public static String HistoryAction_history_item_show_text;
	public static String HistoryAction_history_text;
	public static String HistoryAction_history_tooltip;
	public static String MessageLevelFilterAction_errors_text;
	public static String MessageLevelFilterAction_errors_tooltip;
	public static String MessageLevelFilterAction_infos_text;
	public static String MessageLevelFilterAction_infos_tooltip;
	public static String MessageLevelFilterAction_warnings_text;
	public static String MessageLevelFilterAction_warnings_tooltip;
	public static String MessagesOrderingAction_text;
	public static String MessagesOrderingAction_tooltip;
	public static String RedebugSelectedAction_text;
	public static String RedebugSelectedAction_tooltip;
	public static String RerunAction_text;
	public static String RerunAction_tooltip;
	public static String RerunSelectedAction_text;
	public static String RerunSelectedAction_tooltip;
	public static String ScrollLockAction_name;
	public static String ScrollLockAction_tooltip;
	public static String ShowFailedOnlyAction_text;
	public static String ShowFailedOnlyAction_tooltip;
	public static String ShowFileNameOnlyAction_text;
	public static String ShowFileNameOnlyAction_tooltip;
	public static String ShowNextFailureAction_text;
	public static String ShowNextFailureAction_tooltip;
	public static String ShowPreviousFailureAction_text;
	public static String ShowPreviousFailureAction_tooltip;
	public static String ShowTestsInHierarchyAction_text;
	public static String ShowTestsInHierarchyAction_tooltip;
	public static String ShowTimeAction_text;
	public static String ShowTimeAction_tooltip;
	public static String StopAction_text;
	public static String StopAction_tooltip;
	public static String TestsHierarchyCollapseAllAction_text;
	public static String TestsHierarchyCollapseAllAction_tooltip;
	public static String TestsHierarchyExpandAllAction_text;
	public static String TestsHierarchyExpandAllAction_tooltip;
	public static String ToggleOrientationAction_automatic_text;
	public static String ToggleOrientationAction_horizontal_text;
	public static String ToggleOrientationAction_vertical_text;

	public static String OpenEditorAction_action_label;
	public static String OpenEditorAction_error_cannotopen_message;
	public static String OpenEditorAction_error_cannotopen_title;
	public static String OpenEditorAction_errorOpenEditor;
	public static String OpenEditorAction_error_dialog_message;
	public static String OpenEditorAction_error_dialog_title;
	public static String OpenEditorAction_message_cannotopen;
	public static String OpenEditorAction_UpdateElementsJob_name;
	public static String OpenEditorAction_UpdateElementsJob_inProgress;

}
